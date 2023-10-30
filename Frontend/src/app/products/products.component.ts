import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { BASE_URL } from '../app.module';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent {
  data: any;
  constructor(private http: HttpClient) { }



  ngOnInit(): void {
    // get data from API
    this.http.get(BASE_URL + '/wallets').subscribe({
      next: (data) => {
        this.data = data;
      },
      error: (error) => { }
    });
  }
}
