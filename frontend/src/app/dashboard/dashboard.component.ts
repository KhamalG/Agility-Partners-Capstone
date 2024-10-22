import { Component } from '@angular/core';

export interface StockData {
  symbol: string;
  company: string;
  price: number;
  change: number;
}

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrl: './dashboard.component.css'
})

export class DashboardComponent {

}
