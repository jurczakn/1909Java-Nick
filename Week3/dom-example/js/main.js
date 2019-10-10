window.onload = function() {
    var myParagraph = this.document.getElementById("myParagraph");
    myParagraph.innerHTML = "Hello World";
    let myHeader = this.document.createElement("h1");
    myHeader.innerHTML = "My First DOM Manipulation";
    this.document.getElementById("header-container").appendChild(myHeader);
}