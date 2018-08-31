## **Algorithm Analysis**
* worst case:linear search n
* best case :linear search 1

**big-o**:definition of function growth  
we san say worst case of algorithm
**omega-o**:this is the best case of algorithm  
**teta-o**:equality of best and worst case
little omage and o notations is exclusive cases of big-o and omega-o notations  

example:show the down functions big-o notation
f(x)=x*2 + 2x + 1 

for the x>1 and x>n  
I can show  
x2 + 2x + 1<=x2 + 2x^2 +x^2  
so result is 4x^2   
big-o is O(X^2)  

Constants and little variable is not important  
you can show like x^3 but you will lose advantage of speed  
## **Line of notations**
1 < log^n < n < nlog^n < n^2 <...< 2^n < n! < n^n

## **Complexity example**

example calc:  
for (i...n-1)  
&nbsp;&nbsp;&nbsp;&nbsp;for(j=i..j<n)  

for each i you will do n-1 j loop  
so n-1+n-2+n-3+n-4+n-5+...+1=(n-1)*n/2=>0.5n^2-0.5n  
time complexity is o(n^2)

example 2:  
for (i...n-1)
    if(ai<max)  
for each i you calculate if condition  
condition=2
i...n is n-1....1=>n*2=2n=>O(n)  

example 3:  
for (i...n-1)
for (i...n-1)
for (i...n-1)
complexity is O(n) =3n

**logn notation**   
if your problem time complexity is down everytime this problem has a logaritmic complexity  
example:  
for(i=0i<n;i/2)  
&nbsp;&nbsp;......

this complexity is log(n)  
example 2:  
for(j...n)  
&nbsp;&nbsp;&nbsp;for(i=0i<n;i/2)    
this complexity is nlog(n)  
log2^n .. if(i/3) log3^n

**n^2**n notation  
if problem time complexity is up everytime this problem has a exponential complexity  
 example nested loops  
 every loop increase exponent  
 example  
 for (i...n-1)  
 &nbsp;&nbsp;&nbsp;for (j...n-1)  
 this complexity n^2

## **Recursive functions complexity**
one recursive=one loop
example
mergesort(a,l,f)  T(n)
if(l<r)  @(1)
 mid=floor(left+right)/2 @(1)  
 mergesort(a,l,mid);  T(n/2)
 mergesort(a,mid+1,r);  T(n/2)  
 merge(a,l,mid,r); @(n)
 
so thats complexity=t(n)=t(n/2)*f(n)=>  
for each mergesort you are doing half of another merge sort  
sot for each is n  
half o for each is log(n)  
result is:nlog(n)  