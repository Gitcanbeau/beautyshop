import { TestBed } from '@angular/core/testing';

import { beauty2shopFormService } from './beauty2-shop-form.service';

describe('beauty2shopFormService', () => {
  let service: beauty2shopFormService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(beauty2shopFormService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
