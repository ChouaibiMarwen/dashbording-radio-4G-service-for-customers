import { Message } from '@angular/compiler/src/i18n/i18n_ast';
import { Component, OnInit } from '@angular/core';
import { NgForm} from '@angular/forms'
import { Router } from '@angular/router';
import { Admin } from '../classes/admin';
import { RegistrationService } from '../services/registration.service';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {
  admin = new Admin();
  msg ="";

  constructor(private service : RegistrationService, private _router : Router ) { }

  ngOnInit(): void {
   
  }

  adminRegister(){
    this.service.AdRegistration(this.admin).subscribe(
      data => {
        console.log("response recieved");
        this._router.navigate(['/login']) ;
              
      },
      error => {
         console.log("exeption occured")
           console.error();
          
        }
    )}
  
}
