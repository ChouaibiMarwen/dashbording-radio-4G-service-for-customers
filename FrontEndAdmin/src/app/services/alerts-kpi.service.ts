import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, Observer } from 'rxjs';
import { AlertType } from '../classes/alert-type';
import { Kpi } from '../classes/kpi';

@Injectable({
  providedIn: 'root'
})
export class AlertsKpiService {

  constructor(private http : HttpClient) { }

  public saveKpi( kpii : Kpi):Observable<any>{
    return this.http.post<any>("http://localhost:8080/savekpi", kpii);
  }

  public afficheKpi():Observable<Kpi[]>{
    return this.http.get<Kpi[]>("http://localhost:8080/getKpis")
  }

  public DeleteKpi(idkpi){
    return this.http.delete("http://localhost:8080/deleteKpi?idkpi="+ idkpi)
  }
  
  public getKpisNumber(){
    return this.http.get("http://localhost:8080/kpisNumber");
  }

  public SaveAlertType(alertType : AlertType){
    return this.http.post("http://localhost:8080/saveType" , alertType);
  }

  public afficheAlrtTypes():Observable<AlertType[]>{
    return this.http.get<AlertType[]>("http://localhost:8080/getTypes");
  }

  public deleteAlert(idtype){
    return this.http.delete("http://localhost:8080/deleteTypes?idtype="+ idtype);
  }

  public TypesNumber(){
    return this.http.get("http://localhost:8080/typesNumber");
  }

}
