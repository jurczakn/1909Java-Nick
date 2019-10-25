import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PokemonComponent } from './component/pokemon/pokemon.component';
import { AlertsComponent } from './component/alerts/alerts.component';
import { MyComponentComponent } from './component/my-component/my-component.component';

export const routes: Routes = [
    {path: 'pokemon', component: PokemonComponent},
    {path: 'alerts', component: AlertsComponent},
    {path: 'my', component: MyComponentComponent},
    {path: '', redirectTo: '/pokemon', pathMatch: 'full'}
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule {}
