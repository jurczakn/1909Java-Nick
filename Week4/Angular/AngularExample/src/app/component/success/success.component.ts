import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

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
    this.notifyOnClose.emit(true);
    this.closed = true;
  }

  constructor() { }

  ngOnInit() {
  }

}
