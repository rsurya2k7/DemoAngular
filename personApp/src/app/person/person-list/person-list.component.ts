import { Component, OnInit } from '@angular/core';
import { Person } from "../person"
import { PersonService } from "../person.service";
import { Router } from '@angular/router';

@Component({
    selector: 'app-person-list',
    templateUrl: './person-list.component.html',
    styleUrls: ['./person-list.component.css'],
    providers: [PersonService]
})
export class PersonListComponent implements OnInit {
    private persons: Person[];
    
    constructor(private router: Router,private personService: PersonService) { }

    ngOnInit() {
        this.findByFirst();
    }

    findByFirstName(name:string) {
        this.personService.findByFirstName(name).subscribe(
            persons => {
                this.persons = persons;
            }, err => {
                console.log(err);
            }
        );
    }

    findByFirst() {
        this.personService.findByFirstNm().subscribe(
            persons => {
                this.persons = persons;
            }, err => {
                console.log(err);
            }
        );
    }

    returnToHome(){
        this.router.navigate(['']);
    }
    
    

}
