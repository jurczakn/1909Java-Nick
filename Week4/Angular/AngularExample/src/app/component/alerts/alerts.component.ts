import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-alerts',
  templateUrl: './alerts.component.html',
  styleUrls: ['./alerts.component.css']
})
export class AlertsComponent implements OnInit {

  successClosed = false;

  onNotify(message: boolean) {
    this.successClosed = message;
  }

  constructor() { }

  ngOnInit() {
  }

}
