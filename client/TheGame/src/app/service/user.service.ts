import { User } from '../user';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private usersUrl: string;

  constructor(private http: HttpClient) {

  }

  public getUsers(): Observable<User[]> {
    return this.http.get<User[]>('http://localhost:9002/users/');
  }

}
