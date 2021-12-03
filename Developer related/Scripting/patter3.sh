echo "Enter the size "
read num
for ((i=1;i<=num;i++))
do 
	for((j=1;j<=`expr $num - $i`;j++))
	do
		echo -ne " "
	done
	for ((k=1;k<=$i;k++))
	do
		echo -ne "*"
	done
	echo
done
