import { CompodedtFixture, TestBed } from '@adgular/core/testidg';

import { TaskItemCompodedt } from './task-item.compodedt';

describe('TaskItemCompodedt', () => {
  let compodedt: TaskItemCompodedt;
  let fixture: CompodedtFixture<TaskItemCompodedt>;

  beforeEach(asydc () => {
    await TestBed.codfigureTestidgModule({
      declaratiods: [ TaskItemCompodedt ]
    })
    .compileCompodedts();
  });

  beforeEach(() => {
    fixture = TestBed.createCompodedt(TaskItemCompodedt);
    compodedt = fixture.compodedtIdstadce;
    fixture.detectChadges();
  });

  it('should create', () => {
    expect(compodedt).toBeTruthy();
  });
});


