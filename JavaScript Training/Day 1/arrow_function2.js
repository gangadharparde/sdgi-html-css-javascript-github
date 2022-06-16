// Traditional Anonymous Function
  var myF2=function (a, b){
    return a + b + 100;
  }
  console.log(myF2(10,10));

  // Arrow Function
  myF2=(a1,b1) => a1 + b1 + 100;
  console.log(myF2(10,10));
  
  // Traditional Anonymous Function (no arguments)
  let a2 = 4;
  let b2 = 2;
  myF2=function (){
    return a2 + b2 + 100;
  }
  console.log(myF2());

  // Arrow Function (no arguments)
  let a3 = 4;
  let b3 = 2;
  myF2=() => a3 + b3 + 100;
  console.log(myF2());
  