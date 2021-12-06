def first_diff(STR1,STR2):
    flag =-1
    length1=len(STR1)
    length2=len(STR2)
    length=0
    if(length1<=length2):
        length=length1
    else:
        length=length2
    for ii in range(length):
         if(STR1[ii]!=STR2[ii]):
            flag=ii+1
            break
    return flag
STR1=input('enter the 1st string')
STR2=input('enter the 2nd string')
location =first_diff(STR1,STR2)
print(location)
