function bubble(element, event) {
    event.stopPropagation();  // will prevent both bubbling and capturing
    console.log(element);
    element.style.backgroundColor = "yellow";
    alert(element.id);
}

//Event propagation occurs when you have multiple nested elements
//That all register the same event

//2 Types:
//Bubbling - goes from the child element that had the event occure on it up through it's parents
//Captureing - goes from the parent element back down to the childern, stopping at where
// the inital event occured

window.onload = function() {
    this.document.getElementById("A").addEventListener("click", function(event) {bubble(this, event);}, false);
    this.document.getElementById("B").addEventListener("click", function(event) {bubble(this, event);}, false);
    this.document.getElementById("C").addEventListener("click", function(event) {bubble(this, event);}, false);
    this.document.getElementById("D").addEventListener("click", function(event) {bubble(this, event);}, false);
    
}