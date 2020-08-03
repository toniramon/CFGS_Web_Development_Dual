import { phi } from '../js/phi';
import { findElementsInJson }from '../js/table';

// Import mocked diario.
import { diario } from './mocks/diario.js';

// Test cases.
test('Deberia salir 0.45228', () => {
  expect(phi([76, 9, 1, 4])).toBe('0.45228')
})

test('Deberia salir 0.45228', () => {
  expect(phi([76, 9, 1, 4])).toBe('0.45228')
})

test('Deberia salir 0.06860', () => {
  expect(phi([76, 9, 4, 1])).toBe('0.06860')
})

test('Deberia salir 0.59027', () => {
  let result = findElementsInJson('percebes', diario)
  expect(phi(result)).toBe('0.59027')
})

test('Deberia salir 90', async () => {
  const response = await diario;
  expect(response.length).toBe(90)
})

test('Deberia salir  [76, 9, 4, 1]', async () => {
  expect(findElementsInJson('pizza', await diario)).toEqual([76, 9, 4, 1])
})