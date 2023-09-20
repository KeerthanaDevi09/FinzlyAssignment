import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InputboxWidthChangeComponent } from './inputbox-width-change.component';

describe('InputboxWidthChangeComponent', () => {
  let component: InputboxWidthChangeComponent;
  let fixture: ComponentFixture<InputboxWidthChangeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InputboxWidthChangeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(InputboxWidthChangeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
