import { Component, OnInit } from '@angular/core';
import { Reclamation } from '../classes/reclamation';
import { GetReclamationService } from '../services/get-reclamation.service';
import { NgModule } from '@angular/core';
import { NgbModalConfig, NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { resetFakeAsyncZone } from '@angular/core/testing';
import { stdout } from 'node:process';
import { timeStamp } from 'node:console';
import { Message } from '../classes/message';
import { Router } from '@angular/router';
import {NgForm} from '@angular/forms';


@Component({
  selector: 'app-reclamation',
  templateUrl: './reclamation.component.html',
  styleUrls: ['./reclamation.component.css']
})
export class ReclamationComponent implements OnInit {
  reclamation = new Reclamation();
  Reclamations;
  MyDate = Date.now() ;
  message= new Message();
  username ;
  div1=true;
  div2=false;
  repMessage = new Message();
  d = new Date();
  dformat = [this.d.getDate(),
    this.d.getMonth()+1 ,
     this.d.getFullYear()].join('/')+' '+
    [this.d.getHours(),
     this.d.getMinutes(),
     this.d.getSeconds()].join(':');


  constructor(private service :GetReclamationService, config: NgbModalConfig, private modalService: NgbModal, private router: Router ) {this.getComplaitns();
    config.backdrop = 'static';
    config.keyboard = false;}

  ngOnInit(): void {
  }

getComplaitns(){
   this.service.getAllreclamattion().subscribe(
    (resp)=>{
      console.log(resp);
      console.log("affiché avec succé")
      this.Reclamations=resp;
    },
    (err) => {
      console.log(err)
    }
  )
}
deleteRec( reclamation ){
  this.service.deleteComplaint(reclamation.idrec).subscribe(
  (resp)=>{
    console.log(resp);
    this.getComplaitns();
  },
  (err) => {
    console.log(err)
  }
)
}
getComplDetails(compl){
  this.repMessage.usernres = compl.usrnamesub;
  this.repMessage.idrec = compl.idrec;
}
open(content ) {
  this.modalService.open(content);
  this.div1=true;
  this.div2=false;
  
}
refresh():void{
  window.location.reload();
  this.div1=false;
  this.div2=true;

}

addMessage(){
  this.repMessage.date = this.dformat;
  this.service.sendResponse(this.repMessage).subscribe(
    (resp)=>{
      console.log(resp);
     this.refresh();
      

    },
    (err) =>
    { console.log(err);
    }
      )
  
}

}
