##Problem
Problem: Please implement a function which returns the nth number in 
Fibonacci sequences with an input n.

###Fibonacci Sequence
0->1->1->2->3->5->8 ...  
f(n)=f(n-1)+f(n-2)

###Solution 1: Inefficient recursive solution   
This solution is not very good becaouse its complexity very high.  
You can Find solution in Fibonacci.class->calculateNLogNComplexity  

###Solution 2: Practical Solution with O(n) efficiency
it is the basic solution.  
Fibonacci.class->calculateOnComplexity

###Solution 3: O(logn) solution
Before logn solution I will explain some information about matrix  
Matrix is two dimensional arrays.

####Multiply a number and matrix.  
I will explain with an example   
a*`|x y z t|`   
&nbsp;&nbsp;&nbsp;`|e f g h|`  
result is  
`|ax ay az at|`   
`|ae af ag ah|` 

####Multiply one dimensional to matrix  
When you multiply two matrix you careful first array column number must equal second matrix row number  
example:  
`|x y z|` * `a b g`  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`c d h`  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`e f j`  
you will multiply first matriks every rows to second matriks every rows and you writes as row for result matriks.  
result is  
`xa yc ze`  
`xb yd zf`  
`xg yh zj`  
####Multiply matrix to matrix  
it is completely some rules as above.  
`|q e t|` &nbsp;&nbsp;`|z a b|` &nbsp;&nbsp;&nbsp;`qz+ez+tz` `az+sz+dz` `cz+vz+bz`    
`|a s d|` *&nbsp;`|z a b|`= `qa+ea+ta` `aa+sa+da` `ca+va+ba`  
`|c v b|` &nbsp;&nbsp;`|z a b|` &nbsp;&nbsp;&nbsp;`qb+qb+qb` `ab+sb+db` `cb+vb+bb` 

Now Lets return our problem.  
we will resolve this with matrix.

The Solution is completely about multiply matriks and solution  
Fibonacci.class->calculateOLogNComplexity




