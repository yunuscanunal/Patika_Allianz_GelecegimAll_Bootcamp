import { Component, EventEmitter, Input, Output } from '@angular/core';


@Component({
    selector: 'app-button',
    templateUrl: './button.html',
    styleUrls: ['./button.css']
})
export class ButtonComponent {
    @Input() buttonText: string = "";
    @Input() id: number = 0;

    @Output() onButtonClick = new EventEmitter<number>();

    handleButtonClick(id: number) {
        this.onButtonClick.emit(id);
    }
}