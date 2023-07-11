// const form = document.getElementById('appointment_form').elements;

// for(var i=0;i<form.length;i++)
// {
//     form[i].addEventListener("blur",function(e){
//         e.preventDefault();
//         var inputValue = document.getElementById(form[i]).value;
//         console.log(inputValue);
//     })
// }

var today = new Date();
var dd = today.getDate() ;
var mm = today.getMonth() + 1;
var yyyy = today.getFullYear();
var curr_hours = today.getHours() + 8;
var curr_min = today.getMinutes();

if (dd < 10) 
{
    dd = '0' + dd;
}
 
if (mm < 10) 
{
    mm = '0' + mm;
} 

if(curr_hours > 23)
{
    curr_hours = curr_hours - 24;
}

if(curr_hours < 10)
{
    curr_hours = '0' + curr_hours;
}

if(curr_min < 10)
{
    curr_min = '0' + curr_min;
}
     
today = yyyy + '-' + mm + '-' + dd;
var curr_time = curr_hours+":"+curr_min;
console.log(curr_time);
document.getElementById("dob").setAttribute("max", today);
document.getElementById("doa").setAttribute("min", today);
document.getElementById("toa").setAttribute("min",curr_time);

const form = document.getElementById('appointment_form');
var all = document.querySelectorAll("#appointment_form input, #appointment_form select");
localStorage.setItem("submitform","Submit Form");

//setting items in local storage
for (let field of all)
{
    field.addEventListener("change",function(e){
        e.preventDefault();
        // localStorage.setItem(field.name,field.value);
        localStorage.setItem(field.id,field.value);
        // var q1 = document.querySelector('input[name=q1]:checked').value;
        // localStorage.setItem("q1",q1);
    });
}

var yes1 = form.elements['yes1'].value;
yes1.addEventListener("change",function(e){
    e.preventDefault();
    console.log(yes1);
    localStorage.setItem("yes1",yes1);
})


//getting items from local storage
if(localStorage.length > 0)
{
    for(let field of all)
    {
        field.value = localStorage.getItem(field.id);
    }
}

//form validation

function showMessage(input, message, type) {
	// update the class for the input
    input.setAttribute("placeholder",message);
    // alert(message);
	input.className = type ? "success" : "error";
	return type;
}

function showError(input, message) {
	return showMessage(input, message, false);
}

function hasValue(input, message) {
	if (input.value.trim() === "") {
		return showError(input, message);
	}
	return true;
}

form.addEventListener("submit",function(e){
    e.preventDefault();
    let fname = hasValue(form.elements["fname"],"Enter First Name");
    let lname = hasValue(form.elements["lname"],"Enter last Name");
    let email = hasValue(form.elements["email"],"Enter Email");
    let dob = hasValue(form.elements["dob"],"Enter Date of Birth");
    let doa = hasValue(form.elements["doa"],"Enter Date of Appointment");
    if(fname && lname && email && dob && doa)
    {
        localStorage.clear();
        location.reload();
    }
    
});