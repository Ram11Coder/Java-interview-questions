echo "Enter the size"
read num
a=0 
b=1
for((i=1;i<=num;i++))
do
	echo -ne "$a "
c=`expr $a + $b`
a=$b
b=$c
done
echo

