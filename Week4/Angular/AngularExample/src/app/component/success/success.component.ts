import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { LoggingService } from 'src/app/service/logging.service';

@Component({
  selector: 'app-success',
  templateUrl: './success.component.html',
  styleUrls: ['./success.component.css']
})
export class SuccessComponent implements OnInit {

  message = `Everything is A OK`;

  detailedText = `It actually probably still broken, just ignore that`;

  @Input()
  closed = false;

  @Output()
  notifyOnClose: EventEmitter<boolean> = new EventEmitter<boolean>();

  closeMessage(): void {
    this.logger.log('info', 'The success block was closed by itself');
    this.notifyOnClose.emit(true);
    this.closed = true;
  }

  constructor(private logger: LoggingService) { }

  ngOnInit() {
  }

}
