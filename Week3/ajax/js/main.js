function getPoke() {
    let id = document.getElementById("pokeId").value;

    let xhr = new XMLHttpRequest();

    xhr.onreadystatechange = function() {
        if(xhr.readyState === 4 && xhr.status === 200) {
            let pokemans = JSON.parse(xhr.responseText);
            document.getElementById("pokeName").innerHTML = pokemans.name;
        }
    }

    xhr.open("GET", "https://pokeapi.co/api/v2/pokemon/"+id, true);

    xhr.send();

}

window.onload = function() {
    document.getElementById("submitId").addEventListener("click", getPoke);
}