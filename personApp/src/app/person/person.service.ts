import { Injectable } from '@angular/core';
import { Person } from "./person";
import { Http, Response } from '@angular/http'
import 'rxjs/add/operator/map'
import 'rxjs/add/operator/catch'
import { Observable } from 'rxjs/Observable'


@Injectable()
export class PersonService {
    private apiUrl = 'http://localhost:8090/person';
    constructor(private http: Http) { }

    findByFirstNm(): Observable<Person[]> {
        return this.http.get(this.apiUrl)
            .map((res: Response) => res.json())
            .catch((error: any) => Observable.throw(error.json().error || 'Server Error'));
    }

    findByFirstName(name:string): Observable<Person[]> {
        return this.http.get(this.apiUrl+'/'+name)
            .map((res: Response) => res.json())
            .catch((error: any) => Observable.throw(error.json().error || 'Server Error'));
    }
}
