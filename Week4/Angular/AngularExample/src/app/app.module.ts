import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import { FormsModule } from '@angular/forms';
import { HttpClientModule, HttpClient } from '@angular/common/http';

import { AppComponent } from './app.component';
import { MyComponentComponent } from './component/my-component/my-component.component';
import { SuccessComponent } from './component/success/success.component';
import { AlertsComponent } from './component/alerts/alerts.component';
import { from } from 'rxjs';
import { PokemonComponent } from './component/pokemon/pokemon.component';
import { AppRoutingModule } from './app-routing.module';
import { NavBarComponent } from './component/nav-bar/nav-bar.component';

@NgModule({
  declarations: [
    AppComponent,
    MyComponentComponent,
    SuccessComponent,
    AlertsComponent,
    PokemonComponent,
    NavBarComponent
  ],
  imports: [
    BrowserModule,
    NgbModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [ HttpClient ],
  bootstrap: [AppComponent]
})
export class AppModule { }
