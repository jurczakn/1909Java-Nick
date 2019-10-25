import { Component, OnInit } from '@angular/core';
import { LoggingService } from 'src/app/service/logging.service';

@Component({
  selector: 'app-alerts',
  templateUrl: './alerts.component.html',
  styleUrls: ['./alerts.component.css']
})
export class AlertsComponent implements OnInit {

  successClosed = false;

  onNotify(message: boolean) {
    this.logger.log('warn', 'the success box was closed by something else');
    this.successClosed = message;
  }

  constructor(private logger: LoggingService) { }

  ngOnInit() {
  }

}
