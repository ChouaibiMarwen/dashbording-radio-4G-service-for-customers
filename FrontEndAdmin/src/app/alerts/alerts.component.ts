import { Component, ElementRef, OnInit } from '@angular/core';
import { Kpi } from '../classes/kpi';
import { AlertsKpiService } from '../services/alerts-kpi.service';
import { RegisterSubService } from '../services/register-sub.service';
import { NgbModalConfig, NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { timeStamp } from 'node:console';
import { Router } from '@angular/router';
import { ViewChild } from '@angular/core';
import { NgForm} from '@angular/forms'
import { AlertType } from '../classes/alert-type';

@Component({
  selector: 'app-alerts',
  templateUrl: './alerts.component.html',
  styleUrls: ['./alerts.component.css']
})
export class AlertsComponent implements OnInit {
  kpis ;
  kpii = new Kpi();
  Kkpi = new Kpi();
  k  !: number;
  kpiSelected !: string;
  kpiSelected2 !: string;
  kpiSelected3 !: string;
  kpiSelected4 !: string;
  kpiSelected5 !: string;
  kpiSelected6 !: string;
  descrition;
  desc !: string;
  textA !: string;
  type = new AlertType();
  Types !: AlertType[]; 


  

  constructor(private service : AlertsKpiService,  config: NgbModalConfig, private modalService: NgbModal, private router: Router) {this.getKpis();
    config.backdrop = 'static';
    config.keyboard = false;
  this.getAllTypes() }

  ngOnInit(): void {
  }

getKpis(){
  this.service.afficheKpi().subscribe(
    (resp) => {
      console.log(resp);
      this.kpis = resp;
    }
  ),
  (err)=> {
    console.log(err)

}
}

open(content ) {
  this.modalService.open(content);
}
refresh(): void {
  window.location.reload();
}

SaveKpi(){
  this.service.saveKpi(this.kpii).subscribe(
    (resp) => {
      console.log(resp);
      this.refresh();
      
    }
  ),
  (err)=> {
    console.log(err)

  }  
}

DeleteKpi(){
  this.service.DeleteKpi(this.k).subscribe(
    (resp) =>{
      console.log(resp);
      this.getKpis();

    },
    (err)=> {
      console.log(err)
    }
  );
  
}

saveAlertType(){
  this.type.description = this.descrition;
  this.service.SaveAlertType(this.type).subscribe(
    (resp) =>{
      console.log(resp);
     this.refresh();
    },
    (err)=> {
      console.log(err)
    }
  );  
}

getAllTypes(){
  this.service.afficheAlrtTypes().subscribe(
    (resp)=>{
      console.log(resp);
      this.Types = resp ;
    },
    (err) =>{
      console.log(err);
    }
  )
}
deletType(type){
  this.service.deleteAlert(type.idtype).subscribe(
    (resp) =>{
      console.log(resp);
      this.getAllTypes();
    }
  ),
  (err) => {
    console.log(err);
  }
  
}

}
