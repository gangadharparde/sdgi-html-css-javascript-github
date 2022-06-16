function getDateTime()
{
var today = new Date();

var date = today.getFullYear()+'-'+(today.getMonth()+1)+'-'+today.getDate();

var time = today.getHours() + ":" + today.getMinutes() + ":" + today.getSeconds();

var dateTime = date+' '+time;

alert("\n\nHello.....!!!\n\nCurrent Date and Time is "+ dateTime);

}

function getDateTime2()
{
var today = new Date();

var date = today.getFullYear()+'-'+(today.getMonth()+1)+'-'+today.getDate();

var time = today.getHours() + ":" + today.getMinutes() + ":" + today.getSeconds();

var dateTime = date+' '+time;

return "\n\nHello.....!!!\n\nCurrent Date and Time is "+ dateTime;
}
console.log(getDateTime2());
