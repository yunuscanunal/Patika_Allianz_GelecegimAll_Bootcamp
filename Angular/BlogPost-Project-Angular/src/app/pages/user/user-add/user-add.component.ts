import { Component } from '@angular/core';
import { User } from '../user';
import { UserService } from '../user.service';
import { Router } from '@angular/router';

@Component({
    selector: 'app-user-add',
    templateUrl: './user-add.component.html',
    styleUrls: ['./user-add.component.css']
})
export class UserAddComponent {

    user: User = {
        userId: 0,
        username: "",
        email: "",
        creationDate: "",
        isActive: false
    }

    constructor(private userService: UserService, private router: Router) {
        this.userService.setUsers();
    }

    handleAddClick() {
        this.user.userId = this.userService.getUsers()[this.userService.userCount() - 1].userId + 1;
        if (this.user.username === "" || this.user.email === "" || this.user.creationDate === "") {
            alert("Fill in all the fields.");
        } else if (!this.userService.isUnique(this.user.username, this.user.email, this.user.userId)) {

        } else {
            this.userService.addUser(this.user);
            this.router.navigateByUrl("/user-list");
        }
    }

    handleCancelClick() {
        this.router.navigateByUrl("/user-list");
    }

}