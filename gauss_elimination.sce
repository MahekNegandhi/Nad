tic
n =  input("Enter no. of equations : ");
for i= 1:n
    for j=1:n+1
        a(i,j) = input("");
    end
end
disp(a);

for i = 1 : n
    for j = i+1 : n
 	    k = a(j,i)/a(i,i);
	    for z = i : n+1
	 	    a(j,z) = a(j,z) - ( k * a(i,z) );
	    end
    end
end
x = [ 0 0 0 ];
x(n) = a(n,n+1)/a(n,n);
for i = n-1 : -1 : 1
    sum = 0;
    for j = i+1 : n
       sum = sum + a(i,j) * x(j);
    end
    x(i) = (a(i,n+1) - sum ) / a(i,i);
end
disp(a)
disp(x)
time = toc
