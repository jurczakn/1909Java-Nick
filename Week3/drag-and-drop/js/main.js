function drag(event) {
    event.dataTransfer.setData("text", event.target.id);
}

function allowDrop(event) {
    event.preventDefault();
}

function drop(event) {
    event.preventDefault();
    let data = event.dataTransfer.getData("text");
    event.target.insertBefore(document.getElementById(data), event.target.firstChild);
}

window.onload = function() {
    document.getElementById("outer").addEventListener("drop", drop, false);
    document.getElementById("outer").addEventListener("dragover", allowDrop, false);
    document.getElementById("outer").addEventListener("dragstart", drag, false);

    document.getElementById("inner").addEventListener("drop", drop, false);
    document.getElementById("inner").addEventListener("dragover", allowDrop, false);
    document.getElementById("inner").addEventListener("dragstart", drag, false);
    
    document.getElementById("innerMost").addEventListener("drop", drop, false);
    document.getElementById("innerMost").addEventListener("dragover", allowDrop, false);
    document.getElementById("innerMost").addEventListener("dragstart", drag, false);
}