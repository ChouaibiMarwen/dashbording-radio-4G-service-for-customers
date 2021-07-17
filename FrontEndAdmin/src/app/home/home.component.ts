import { Component, OnInit } from '@angular/core';
import { AlertsKpiService } from '../services/alerts-kpi.service';
import { GetReclamationService } from '../services/get-reclamation.service';
import { RegisterSubService } from '../services/register-sub.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  kpiNumber;
  typesNumber;
  complaintsNumber;
  orangeNumber;
  telecomeNumber;
  ooredooNumber;

  constructor( private service : AlertsKpiService, private service2 : GetReclamationService, private service3 : RegisterSubService) { this.KpisNumber(); this.TypesNumber();  this.CompliantsNuber();
   this.OrangeSubAdminAccNumber(); this.TelecomSubAdminAccNumber(); this.OoredooSubAdminAccNumber()}

  ngOnInit(): void {
  }
  
  KpisNumber(){
    this.service.getKpisNumber().subscribe(
      (resp) =>{
        this.kpiNumber = resp;
        console.log(resp)
      },
      (err)=>{
        console.log(err)
      }
    )
  }

  TypesNumber(){
    this.service.TypesNumber().subscribe(
      (resp) =>{
      this.typesNumber = resp;
      console.log(resp)
    },
    (err)=>{
      console.log(err)
    })
  
      
  }

  CompliantsNuber(){
    return this.service2.getComplaintsNumber().subscribe(
      (resp)=>{
        console.log(resp);
        this.complaintsNumber = resp;

      },
      (err) =>{
        console.log(err);
      }
    )
  }

  OrangeSubAdminAccNumber(){
    return this.service3.getOrangeSubAdinAccNumber("orange").subscribe(
      (resp)=> {
        console.log(resp);
        this.orangeNumber = resp;
      },
      (err) => {
        console.log(err);
      }
    )
  }
  OoredooSubAdminAccNumber(){
    return this.service3.getOrangeSubAdinAccNumber("ooredoo").subscribe(
      (resp)=> {
        console.log(resp);
        this.ooredooNumber = resp;
      },
      (err) => {
        console.log(err);
      }
    )
  }
  TelecomSubAdminAccNumber(){
    return this.service3.getOrangeSubAdinAccNumber("telecome").subscribe(
      (resp)=> {
        console.log(resp);
        this.telecomeNumber = resp;
      },
      (err) => {
        console.log(err);
      }
    )
  }

}
