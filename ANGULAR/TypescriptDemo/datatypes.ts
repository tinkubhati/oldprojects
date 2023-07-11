let fname : string;
fname='Tinku';

let newName= fname.toUpperCase();

console.log(newName);

 let empList : Array<string> = ['tinku','fahad','roop','ved'];
 let numList: Array<number> = [1,23,43,23.34,35,986,34/34,54.6654];

 let results = numList.reduce((acc,num) => num + acc +num/num);

 let result = empList.find((emp)=>emp==='tinku');

 console.log(result);
 console.log(results);


//fname = 10;