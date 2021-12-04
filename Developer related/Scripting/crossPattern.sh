
echo  "Enter the size"
read n
for ((i=1;i<=$n;i++))
do
	for ((j=1;j<=$n;j++))
	do	
		if test  $j -eq `expr $n + 1 - $i`
		then
			echo -ne "* "
		elif test $i -eq $j 
			then
echo -ne "* "
		
		else
			echo -ne " "
		fi
		done
	echo 
done


