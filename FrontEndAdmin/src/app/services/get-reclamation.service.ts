import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, Observer } from 'rxjs';
import { Message } from '../classes/message';
import { Reclamation } from '../classes/reclamation';

@Injectable({
  providedIn: 'root'
})
export class GetReclamationService {

  constructor( private http : HttpClient) { }

  public getAllreclamattion():Observable<Reclamation[]> {
    
    return this.http.get<Reclamation[]>("http://localhost:8080/getComplaints")
  }

  public deleteComplaint(id){
    return this.http.delete("http://localhost:8080/deleteComp?idrec="+id);
  }

  public sendResponse( responseMess: Message){
    
    return this.http.post("http://localhost:8080/sentResponse", responseMess);

  }

  public getComplaintsNumber(){
    return this.http.get("http://localhost:8080/complaintsNumber");
  }

}
