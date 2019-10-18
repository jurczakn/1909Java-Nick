import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-structural',
  templateUrl: './structural.component.html',
  styleUrls: ['./structural.component.css']
})
export class StructuralComponent implements OnInit {

  spaghettiList: Array<String> = [`penne`, `angel hair`, `shells`, `elbows`, `spaghetti`];

  constructor() { }

  ngOnInit() {
  }

}
