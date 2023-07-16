import { Injectable } from '@angular/core';
import { User } from './user';
import { dataUsers } from '../../../assets/data/dataUsers'; //data

@Injectable({
    providedIn: 'root'
})
export class UserService {



    private users: User[] = []
    constructor() { }
    getUsers(): User[] {
        return this.users;
    }
    setUsers(): void {
        this.users = dataUsers;
    }


    deleteUser(id: number): void {
        this.users = this.users.filter((user) => user.userId !== id);
    }

    findUserById(id: number): User | undefined {
        return this.users.find((user) => user.userId === Number(id))
    }

    findUserByUsername(username: string): User | undefined {
        return this.users.find((user) => user.username === username)
    }

    findUserByEmail(email: string): User | undefined {
        return this.users.find((user) => user.email === email)
    }

    userCount(): number {
        return this.users.length;

    }

    editUser(editedUser: User, id: number): void {
        this.users = this.users.map(user => {
            if (user.userId === id)
                user = editedUser
            return user;
        });
    }
    addUser(user: User): void {
        this.users.push(user);
    }

    //username ve email unique 
    checkUnique(username: string, email: string, id: number): boolean {
        if (this.users.find((user) => user.username === username.toLowerCase()) !== undefined
            && this.findUserByUsername(username.toLowerCase())!.userId !== id)
            return false;
        else if (this.users.find((user) => user.email === email.toLowerCase()) !== undefined
            && this.findUserByEmail(email.toLowerCase())!.userId !== id)
            return false;
        else
            return true;
    }


}