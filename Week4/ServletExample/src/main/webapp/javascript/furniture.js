class Furniture {
    constructor(name, type, manufacturer, cost, owner, difficulty) {
        this.name = name;
        this.type = type;
        this.manufacturer = manufacturer;
        this.price = cost;
        this.difficulty = difficulty;
        this.owner = {"username":owner};
    }
}

function postFurniture () {
    let name = document.getElementById("name").value;
    let manufacturer = document.getElementById("manufacturer").value;
    let type = document.getElementById("type").value;
    let cost = document.getElementById("cost").value;
    let difficulty = document.getElementById("difficulty").value;
    let owner = document.getElementById("owner").value;
    let xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        if (xhr.readyState === 4) {
            if (xhr.status === 200) {
                document.getElementById("result").innerHTML = xhr.responseText;
                getAllFurniture();
            } else {
                document.getElementById("result").innerHTML = "Failed to create furniture :(";
            }
        } else {
            document.getElementById("result").innerHTML = "Processing Request";
        }
    }
    xhr.open("POST", "furniture", true);
    xhr.send(JSON.stringify(new Furniture(name, type, manufacturer, cost, owner, difficulty)));
}

function displayFurnitureList(furniture) {

    let list = document.getElementById("furnitureList");

    list.innerHTML = "";

    for(f of furniture) {
        let item = document.createElement("li");
        item.innerHTML = f.name;
        list.appendChild(item);
    }

}

function getAllFurniture() {
    let xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        if (xhr.readyState === 4) {
            if (xhr.status === 200) {
                displayFurnitureList(JSON.parse(xhr.responseText));
            } else {
                document.getElementById("furnitureList").innerHTML = "Failed to retireve furniture :(";
            }
        } else {
            document.getElementById("furnitureList").innerHTML = "Fetching Request";
        }
    }
    xhr.open("GET", "furniture", true);
    xhr.send();
}

function getFurnitureByName() {
    let name = document.getElementById("search-name").value;
    let xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        if (xhr.readyState === 4) {
            if (xhr.status === 200) {
                document.getElementById("search-result").innerHTML = (xhr.responseText);
            } else {
                document.getElementById("search-result").innerHTML = "Failed to retireve furniture :(";
            }
        } else {
            document.getElementById("search-result").innerHTML = "Fetching Request";
        }
    }
    xhr.open("GET", "furniture/"+name, true);
    xhr.send();
}

window.onload = function() {
    this.getAllFurniture();
    this.document.getElementById("postFurniture").addEventListener("click", postFurniture, false);
    this.document.getElementById("search-button").addEventListener("click", getFurnitureByName, false);
    
}