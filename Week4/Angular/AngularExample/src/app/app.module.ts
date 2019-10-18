import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { MyComponentComponent } from './component/my-component/my-component.component';
import { SuccessComponent } from './component/success/success.component';
import { AlertsComponent } from './component/alerts/alerts.component';

@NgModule({
  declarations: [
    AppComponent,
    MyComponentComponent,
    SuccessComponent,
    AlertsComponent
  ],
  imports: [
    BrowserModule,
    NgbModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
