// build a matrix that will contain various lists
var matrix = List(List(1,0,0), List(0,1,0), List(0,0,1), List(0,0,0), List(1,1,1)) 

// see if there is an entry where all of the elements of the list equals zero
println("All Zeroes exist? " + matrix.exists(row => row.forall(0 ==)))
println("All Ones exist? " + matrix.exists(row => row.forall(1 ==)))

// show how you can filter a list down based on some predicate
var testNbr = 1;
var newList = matrix.filter(a => a(0) == testNbr)
println("New List starting with " + testNbr  + ": " + newList);

// show how you can filter a list down based on some predicate
testNbr = 0;
newList = matrix.filter(a => a(0) == testNbr)
println("New List starting with " + testNbr  + ": " + newList);
