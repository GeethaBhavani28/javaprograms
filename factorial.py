def number_of_factors(val):
    count=0
    for ii in range (1,val+1):
        if((val%ii)==0):
            count=count+1
    return count
val1=int(input('enter a number'))
count1=number_of_factors(val1)
print('number of factors=',count1)
