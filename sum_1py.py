def sum_digits(temp):
 summ=0
 for ii in range(len(num)):
    summ= summ + temp%10
    temp=int(temp/10)
 return summ

num = input('enter a number')
temp=int(num)
summ=sum_digits(temp)
print('the sum of digits is=',summ)
