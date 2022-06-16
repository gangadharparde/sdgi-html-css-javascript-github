// Invoke this keyword from browser the output is different:
function gd(){
    console.log(this);
}
gd();

function globalObj(){
    console.log(window);
}
globalObj();