import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-databinding',
  templateUrl: './databinding.component.html',
  styleUrls: ['./databinding.component.css']
})
export class DatabindingComponent implements OnInit {

  title = `DataBinding`;
  interpolationNotation = `{{}}`;
  propertyNotation = `[]`;
  eventNotation = `()`;
  counter = 0;

  objectStyle = {
    color: 'yellow',
    border: '1px solid black',
    cursor: 'pointer',
    margin: '2px',
    backgroundColor: 'red'
  };

  twoWayNotation = `[()]`;

  inputValue = `This will not be the inital value`;

  addToCounter() {
    this.counter++;
  }

  changeStyle() {
    if (this.objectStyle.color === 'yellow') {
      this.objectStyle.color = 'green';
      this.objectStyle.backgroundColor = 'purple';
      this.objectStyle.border = '3px ridge red';
    } else if(this.objectStyle.color === 'green') {
      this.objectStyle.color = 'cornsilk';
      this.objectStyle.backgroundColor = 'thistle';
      this.objectStyle.border = '7px groove cyan';
    } else if(this.objectStyle.color === 'cornsilk'){
      this.objectStyle.color = 'yellow';
      this.objectStyle.backgroundColor = 'periwinkle';
      this.objectStyle.border = '12px solid peru';
    }
  }

  constructor() { }

  ngOnInit() {
  }



}
