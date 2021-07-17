import { Component, OnInit, ViewChild } from '@angular/core';
import { resetFakeAsyncZone } from '@angular/core/testing';
import { FormGroup, NgForm } from '@angular/forms';
import { Router, RouterLink } from '@angular/router';
import { timeStamp } from 'node:console';
import { stdout } from 'node:process';
import { Observable } from 'rxjs';
import { SubAdmin } from '../classes/sub-admin';
import { RegisterSubService } from '../services/register-sub.service';
import { NgbModalConfig, NgbModal } from '@ng-bootstrap/ng-bootstrap';





@Component({
  selector: 'app-manage-acc',
  templateUrl: './manage-acc.component.html',
  styleUrls: ['./manage-acc.component.css'],
  providers: [NgbModalConfig, NgbModal]
})
export class ManageAccComponent implements OnInit {
  subAdmin = new SubAdmin();
  SubAdmins!: SubAdmin[];

  subAdminUpdated = {
    idSub: 0,
    firstname:"",
    lastname:"",
    email:"",
    phonenumber:"",
    username:"",
    password:"",
    operator:"",
  }

  constructor(private service : RegisterSubService, private router: Router,
    config: NgbModalConfig, private modalService: NgbModal) {  this.getSubAdminDetails();
      config.backdrop = 'static';
      config.keyboard = false;}

  ngOnInit(): void {
  }

  RegisterSub(){
   return  this.service.registerSub(this.subAdmin).subscribe(
      (resp) =>{
        console.log(resp);
        this.router.navigate(['/accounts']);
        this.getSubAdminDetails();
        
      },
       (err)  => {
          console.log(err)
      }
    )
  }

  getSubAdminDetails(){
    this.service.getSubAdmins().subscribe(
      (resp) => {
        console.log(resp);
        this.SubAdmins = resp;
       
      },
      (err) =>{
        console.log(err);
      }
    );

  }

  DeleteSub(subAdmin: SubAdmin){
    this.service.deleteSub(subAdmin.idSub).subscribe(
      (resp) =>{
          console.log(resp);
          this.getSubAdminDetails();
      },
      (err) =>{
        console.log(err);
      }
      )
  }

  open(content ) {
    this.modalService.open(content);
  }
  opennn(register){
    this.modalService.open(register);
  }
  edit(subAdmin){
    this.subAdminUpdated = subAdmin;
  }

  updateSubAdmin(){
    this.DeleteSub(this.subAdminUpdated),
    this.service.updateSub(this.subAdminUpdated).subscribe(
      (resp)=>{
          console.log(resp);
          this.getSubAdminDetails();
      },
      (err) =>{
        console.log(err);
      }
    )
  }
}
