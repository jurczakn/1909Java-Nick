import { Component, OnInit } from '@angular/core';
import { Pokemon } from 'src/app/types/pokeman';
import { PokemonService } from 'src/app/service/pokemon.service';

@Component({
  selector: 'app-pokemon',
  templateUrl: './pokemon.component.html',
  styleUrls: ['./pokemon.component.css']
})
export class PokemonComponent implements OnInit {

  id: string;

  myPokemon: Pokemon;

  constructor(private pokemonService: PokemonService) { }

  ngOnInit() {
  }

  getPokemon() {
    this.pokemonService.getPokemon(this.id).subscribe(
      data => this.myPokemon = data
    );
  }

}
