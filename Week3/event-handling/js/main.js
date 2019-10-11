var globalMediaPost;

window.onload = function() {                                               //vvvvvvv------Callback Function
    this.document.getElementById("submitForm").addEventListener("click", grabMediaPost);
}

class MediaPost {
    constructor(author, message, style) {
        this.author = author;
        this.message = message;
        this.style = style;
    }
}

function grabMediaPost(event) {
    event.preventDefault();
    let author = document.getElementById("author").value;
    let message = document.getElementById("message").value;
    let style = getStyle();
    let mediaPost = new MediaPost(author, message, style);
    globalMediaPost = mediaPost;
    displayMediaPost(mediaPost);
}

function displayMediaPost(post) {
    document.getElementById("display").innerHTML = `author: ${post.author}
    message: ${post.message}
    style: ${post.style}`
}

function getStyle() {
    let radioStyle = document.getElementsByName("style");
    for(i of radioStyle) {
        if(i.checked){
            return i.value;
        }
    }
}