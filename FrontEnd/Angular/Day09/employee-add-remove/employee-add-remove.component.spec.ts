import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeAddRemoveComponent } from './employee-add-remove.component';

describe('EmployeeAddRemoveComponent', () => {
  let component: EmployeeAddRemoveComponent;
  let fixture: ComponentFixture<EmployeeAddRemoveComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EmployeeAddRemoveComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeeAddRemoveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
