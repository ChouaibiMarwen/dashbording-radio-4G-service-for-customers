import { Component, OnInit } from '@angular/core';
import {NgForm} from '@angular/forms';
import { Router } from '@angular/router';
import { Admin } from '../classes/admin';
import { RegistrationService } from '../services/registration.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  admin = new Admin();
  msg = '';

  constructor(private _service : RegistrationService , private _router : Router) { }

  ngOnInit(): void {
  }

  adminLogin(){
    this._service.LoginAdmin(this.admin).subscribe(
      data => {
        console.log("response recived");
        this._router.navigate(['/homeAdmin'])
    },

      error => {
        console.log("exception occured");
        this.msg = "Please enter valid User Name and Password";
    }
      
    )
  }

  gotoRegisterComp(){
    this._router.navigate(['/registration']);
  }
}
