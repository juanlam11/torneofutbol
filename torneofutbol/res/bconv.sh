#!/bin/bash
let j=1
FILES=/home/dario/git/torneofutbol/torneofutbol/res/images/*
for i in $FILES
do
	res="$(cat $i | base64)"
	echo $res >> /home/dario/git/torneofutbol/torneofutbol/res/b64.out
	QUERY='UPDATE Equipo SET escudo='\'$res\'' WHERE codigoEquipo='$j';'
	echo $QUERY >> /home/dario/git/torneofutbol/torneofutbol/res/populate_img.sql
	let j=$j+1
done

